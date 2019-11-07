
JARS=./junit-4.12.jar:./hamcrest-core-1.3.jar:.

.java.class:
	javac -cp $(JARS) *.java

CLASSES = FileCounting.java\
 CountInFile.java\
 TestFileCounting.java

.SUFFIXES: .java .class

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

test: classes
	java -cp $(JARS) org.junit.runner.JUnitCore TestFileCounting

