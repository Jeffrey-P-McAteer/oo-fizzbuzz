
# Object-Oriented FizzBuzz

_Written in Java, of course_

I had an entertaining discussion with some IBM engineers today,
and one of the things we talked about was the "Least efficient FizzBuzz" implementation.

This repository is a recap of a program design we came up with,
pull requests to "optimize efficiency" are welcome.
Pull requests which actually optimize efficiency will be ignored and sent to an Eclipse engineer as a feature enhancement request.

# Usage

This is built using gradle, so you'd think `gradle run` would be enough.
It isn't, because we read a number from STDIN.

The quickest way to run this on a unix machine with `gradle` installed is to run
`./simplest-run.sh`. Enjoy, have a nice day.

If you are running windows without `gradle` installed and without a JVM, install a JVM first and come back.

Got a JVM?

Great. Run `.\gradlew.bat build`, then you can invoke the program like so:

```bash
java -cp build\libs\oo-fizzbuzz.jar edu.odu.cs.jmcateer.FizzBuzzMain
```

Congratulations! You've missed out on 15 minutes of time that could have been spent productively.



