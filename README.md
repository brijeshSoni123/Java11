# Java11 with spring web and gradle

### Creating a custom JRE image using JLink
  jlink --module-path jmods --compress=2 --add-modules **java.base** --no-header-files--no-man-pages --output **jdk-11-mini-runtime**
  
| code | use |
|------ | -----|
java.base | name of the modules that jre is going to support once image is created
jdk-11-mini-runtime | name of the jre folder which will be created after executing this command


##Generating Module-info for legacy jar
jdeps --module-path automatic-modules --generate-module-info . snakeyaml-1.23.jar
refer:-https://examples.javacodegeeks.com/core-java/java-9-jdeps-example/

1. to update a jar simply open it as zip and work on it.
2. jar tvf {JAR} -> to check contents inside a jar file
3. jar uvf {JAR} {file/package structure} *
4. genrating module-info.java 
	jdeps --generate-module-info {DIR} {JAR}
5. extract jar file
	jar vxf {JAR}
6. compile module-info to create a class file which could be loaded into jar
	a. dir  /B  /S | find ".java" > sourcePath.txt
	b. javac --module-path {module-info.java_PATH} -d {compliledSourceFolderName} @sourcePath.txt
	c. jar uvf {JAR} -C classes module-info.class
				OR
	d. jar --update --file {JAR} --module-version 1.0 -C . module-info.class


### minimum configuration needed for Spring Boot 2.0.X
	* jlink --module-path jmods --verbose --add-modules java.base,java.logging,java.xml,jdk.unsupported,java.sql,java.naming,java.desktop,java.management,java.security.jgss,java.instrument --compress 2 --no-header-files --output java-11-minimal
