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
