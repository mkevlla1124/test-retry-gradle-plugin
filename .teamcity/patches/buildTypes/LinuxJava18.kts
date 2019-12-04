package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'LinuxJava18'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("LinuxJava18")) {
    dependencies {
        remove(RelativeId("VerifyAll")) {
            snapshot {
                onDependencyFailure = FailureAction.CANCEL
                onDependencyCancel = FailureAction.CANCEL
            }
        }

        add(RelativeId("TestRetryPluginQuickFeedback")) {
            snapshot {
                onDependencyFailure = FailureAction.CANCEL
                onDependencyCancel = FailureAction.CANCEL
            }
        }

    }
}