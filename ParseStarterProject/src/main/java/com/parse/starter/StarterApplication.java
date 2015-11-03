/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;


public class StarterApplication extends Application
{

    String applicationid = "Iq7V6MHZDGsqnpyml7iArObRXvSvy72DwdgHs4Gp";
    String clientkey = "gaLsFGt0XVxTgIvH8LIbRWZxwWZlSFoUP6SPc64T";

    public StarterApplication()
    {
    }

    @Override
    public void onCreate()
    {
        super.onCreate();

        // Initialize the Parse SDK.
        Parse.initialize(this, applicationid, clientkey);

        // Specify a Activity to handle all pushes by default.
//    PushService.setDefaultPushCallback(this, MainActivity.class);

        // Save the current installation.
//        ParseInstallation.getCurrentInstallation().saveInBackground();


//        PushService.setDefaultPushCallback(this, MainActivity.class);
//        PushService.subscribe(this, "newshirt", MainActivity.class);
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
