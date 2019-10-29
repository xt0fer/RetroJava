# RetroJava

create a commandline program for counting the lines, words and characters within a set of files.

(like it used to be done in the Olden Days).

Create, using a standard text editor like nano, two class files (CountInFile.java & FileCounting.java) that will produce the following output when run from the shell:

$ java CountInFile *.txt
      34     268    1425 antonysspeech.txt
      75     458    2783 chineseproverbs.txt
      70     758    4193 flushingremonstrance.txt
      11      99     649 preamble.txt
      12     106     713 primedirective.txt
     202    1689    9763 total

Use ONLY nano, javac, and other command line tools to create this program. 

DO NOT use IntelliJ, or other code editors.

The point of this lab is to understand how to create a java program using only shell tools.

CountInFile should get the command line arguments, and then create a FileCounting object and call a method named:

`public String ScanTheFile(String filename)` which return 

`      34     268    1425 antonysspeech.txt` when handed "antonysspeech.txt"

CountInFile should do this for each file passed on the command line when invoked from the shell.

What does a .class file do? How do you get one from a .java file?


