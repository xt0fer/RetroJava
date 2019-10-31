JFLAGS = -g
# -g makes sure debugging info in code.
JC = javac
PROJ=.
JARS = ./junit-4.12.jar:./hamcrest-core-1.3.jar:.

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) -cp $(JARS) $*.java

CLASSES = FileCounting.java\
	CountInFile.java\
	TestFileCounting.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

test: classes
	java -cp $(JARS) org.junit.runner.JUnitCore TestFileCounting
