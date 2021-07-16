package com.gittest.app.appcomponents.googleauth

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.core.app.ActivityCompat.startActivityForResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task

class GoogleHelper(private val activity: Activity,private val onSuccess: (account: GoogleSignInAccount) -> Unit,private val onError: (statusCode: Int) -> Unit) {

    private var mGoogleSignInClient: GoogleSignInClient? = null

    /** This method will be used for login
    *  @param RC_SIGN_IN for the request code
    *  How to use: on the button click call this method
    *  [Class_Object].login()
    * */
    fun login(RC_SIGN_IN: Int){
        configureGoogleSignIn()
        val account = GoogleSignIn.getLastSignedInAccount(activity)
        if(account!=null){
            onSuccess(account)
        }else{
            signIn(RC_SIGN_IN)
        }
    }

    /** configure Google Sign-In to request the user data required by application
    *  ID and basic profile are included in DEFAULT_SIGN_IN.
    *  To request users' email addresses as well, create the GoogleSignInOptions object with the requestEmail option.
    *  How to use:
    *  [Class_Object].configureGoogleSignIn()
    * */
    private fun configureGoogleSignIn() {
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()
        mGoogleSignInClient = GoogleSignIn.getClient(activity, gso)
    }

    /** This function will be used handle the result
    *  @param data it is the intent passed as a parameter
    *  How to use:
    *  used from the onActivityResult
    *  if(requestCode == RC_SIGN_IN) {
    *         [Class_Object].handleResult(data)
    *  }
    * */
    fun handleResult(data: Intent?) {
        val task =  GoogleSignIn.getSignedInAccountFromIntent(data)
        try {
            val account: GoogleSignInAccount? = task.getResult(ApiException::class.java)
            if (account != null) {
                onSuccess(account)
            }
        } catch (e: ApiException) {
            onError(e.statusCode)
        }
    }


    /** Call the signIn intent
    *  @param RC_SIGN_IN for the request code
    *  this function will call startActivityForResult from their result will be handled
    * */
    private fun signIn(RC_SIGN_IN:Int) {
        val signInIntent: Intent = mGoogleSignInClient!!.signInIntent
        startActivityForResult(activity, signInIntent, RC_SIGN_IN, null)
    }


    /** Sign out the user
    *  How to use:
    *  [Class_Object].signOut { task ->  }
    * */
    fun signOut(onComplete: (task: Task<Void>) -> Unit) {
        mGoogleSignInClient?.signOut()?.addOnCompleteListener(
            activity
        ) { task -> onComplete(task) }
    }

    /** revoke the access, disconnect user's Google account from the app
    *  How to use:
    *  [Class_Object].revokeAccess{task -> }
    * */
    fun revokeAccess(onComplete: (task: Task<Void>) -> Unit) {
        mGoogleSignInClient!!.revokeAccess()
            .addOnCompleteListener(
                activity
            ) { task -> onComplete(task) }
    }
}