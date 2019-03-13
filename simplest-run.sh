#!/bin/sh

gradle build || exit 1

# Add self to classpath, invoke class from long package name
java -cp build/libs/oo-fizzbuzz.jar edu.odu.cs.jmcateer.FizzBuzzMain


