# romanization-transliteration-utils
Converts the given unicode text to Romanized form also called as transliterated text. In the current time, Tamil Romanization is called Tanglish, Kannada Romanization is called Kanglish, Hindi Romanization is called Hinglish.

# Usage
If you clone from Git or download a source zip, you will need a Java JDK 8 or above (tested up to 11) to build. You can use Eclipse or IntelliJ or Visual Code IDEs to build the binary and you will find a suitable distribution .jar file in the project folder.

If you download a romanization-transliteration-utils.jar file, you will need a Java Runtime Environment 8 or above, available from [https://www.oracle.com/in/java/technologies/downloads/](https://www.oracle.com/in/java/technologies/downloads/).

Just run

~~~
java -jar romanization-transliteration-utils.jar
~~~

on the command line for usage information.

# Steps to use romanization-transliteration-utils.jar
1. Download & Install JRE or Java from https://www.oracle.com/in/java/technologies/downloads/
2. Open your command prompt or Terminal and use the below syntax to run the program.
3. Syntax to run this program:

~~~
java -jar romanization-transliteration-utils.jar <LANGUAGE-CODE> <INPUT-FILE-PATH-WITH-TEXT-TO-BE-CONVERTED>
~~~
Example: java -jar romanization-transliteration-utils.jar ta C:/sample-input-file.txt

In the above example "ta" represents Tamil language
Use / in the input file path. Do not use \
