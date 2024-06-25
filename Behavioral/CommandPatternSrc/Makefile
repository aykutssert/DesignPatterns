# Project: CommandPattern
JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
    CommandPattern/CommandPatternExample.java \
    CommandPattern/GenericCommand/Command.java \
    CommandPattern/ConcreteCommands/TurnOnCommand.java \
    CommandPattern/ConcreteCommands/TurnOffCommand.java \
    CommandPattern/ConcreteCommands/AdjustVolumeCommand.java \
    CommandPattern/ConcreteCommands/ChangeChannelCommand.java \
    CommandPattern/Receivers/Device.java \
    CommandPattern/Receivers/Tv.java \
    CommandPattern/Receivers/Stereo.java \
    CommandPattern/Invoker_RemoteControl/RemoteControl.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	rm -f CommandPattern/*.class CommandPattern/GenericCommand/*.class CommandPattern/ConcreteCommands/*.class CommandPattern/Receivers/*.class CommandPattern/Invoker_RemoteControl/*.class
