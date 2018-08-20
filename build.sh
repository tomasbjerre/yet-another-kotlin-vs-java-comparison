#!/bin/bash
./gradlew build -x verifyGoogleJavaFormat -i || exit
find build/classes/kotlin/main/ | grep class$ | xargs java -jar lib/cfr_0_132.jar --outputdir src/main/java || exit
find src/main/java -regex ".*\.java$" -exec sed -i '/@Metadata/ d' {} \;
./gradlew googleJavaFormat -x verifyGoogleJavaFormat -i || exit
./gradlew generateComparison || exit
