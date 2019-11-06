# RetroJava

create a commandline program for counting the lines, words and characters within a set of files.

(like it used to be done in the Olden Days).

Create, using a standard text editor like nano, two class files (CountInFile.java & FileCounting.java) that will produce the following output when run from the shell:

```
$ java CountInFile *.txt
      34     268    1425 antonysspeech.txt
      75     458    2783 chineseproverbs.txt
      70     758    4193 flushingremonstrance.txt
      11      99     649 preamble.txt
      12     106     713 primedirective.txt
```

Use ONLY nano, javac, and other command line tools to create this program. 

DO NOT use IntelliJ, or other code editors.

The point of this lab is to understand how to create a java program using only shell tools. All the .txt files are just samples
of text and just used as input. (If it matters, they are all in UTF-8 format.)

CountInFile should get the command line arguments, and then create a FileCounting object and call a method named:

`public String ScanTheFile(String filename)` which returns 

`      34     268    1425 antonysspeech.txt` when handed "antonysspeech.txt"

CountInFile should do this for each file passed on the command line when invoked from the shell.

What does a .class file do? How do you get one from a .java file

You may, should you find it necessary, use a command line tool called `make`.

NOTA BENE: You may need to understand the difference between a string's length and the byte[] that it actually uses. This comes into play when looking at the file with the chinese characters in it.

NOTA BENE: If you want to understand what program you are trying to mimic, use `wc` without any commandline flags.

You should only need the two supplied JAR files with the JUnit testing stuf in them.

#### Some more pointers.

When looking at the this lab, you should consider it a chance to learn how to use a terminal based screen editor for text files. You might use Nano or Vim (or even, gasp, Emacs) https://medium.com/linode-cube/emacs-nano-or-vim-choose-your-terminal-based-text-editor-wisely-8f3826c92a68 You may also need (and you should) use make to handle not having to type long java compile and test lines when you run your compiler on the code you develop.  https://www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html
