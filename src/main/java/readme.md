## Overview

This outlines how you build and run the Triangle Popup dialog box.

## Prereqs

- Install Java SDK

## Building

Compile: First compile the java code using this format below:

    javac PATH-TO-JAVA-FILE/JAVA-FILE-NAME

    javac com/project/TestUI.java

## Running the java application

Run: Then run 'java className' to run the application

    java PACKAGE-PATH.CLASS-NAME

    java com.project.TestUI


---

## Create a JAR file and run the compiled jar 

# Create the JAR file using the below command
This will create a file named 'TriangleApplication.jar' in the current directory


    jar cvfm TriangleApplication.jar manifest.txt *

# Run the created JAR using the below command


    java -jar TriangleApplication.jar



