#!/bin/bash
./gradlew build -x verifyGoogleJavaFormat -i || exit
find build/classes/kotlin/main/ | grep class$ | xargs java -jar lib/cfr_0_132.jar --outputdir src/main/java || exit
./gradlew googleJavaFormat -x verifyGoogleJavaFormat -i || exit
./gradlew generateComparison || exit
