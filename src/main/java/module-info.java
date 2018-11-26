module modular.main {
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.web;
    requires spring.beans;
    requires spring.context;
    opens com.modular.main to spring.core, spring.beans, spring.context;
    opens com.modular.main.rest to spring.beans, spring.web, spring.core;


}
