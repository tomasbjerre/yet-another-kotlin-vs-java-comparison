#!/bin/bash
./gradlew generateComparison -x verifyGoogleJavaFormat || ./gradlew generateComparison -x verifyGoogleJavaFormat -i
