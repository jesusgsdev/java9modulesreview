# Java 9 Modules Review
Java 9 Modularity Review and examples


## Prerequisites
You must have installed at least Java version 9.0.4 on your system in order to run this project. 
Link here: http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html

If you want to know how to install several Java versions in your MacOS system please
checkout this guide: https://gist.github.com/ntamvl/5f4dbaa8f68e6897b99682a395a44c2e

## Project modules

### Books Module
- In this module I included a dummy data generator for books in the root folder called `DummyBooksData`
to generate books for the examples.
- I created a Main class so you can test the module individually
- This module will export the shared package to be used by other modules.

The module-info.java file looks like:
```
module com.jesusgsdev.booksmodule {
    requires java.base;

    exports com.jesusgsdev.booksmodule.shared;
}
```

### Customers Module
- In this module I included a dummy data generator for customers in the root folder called 
`DummyCustomersData` to generate books for the examples.
- I created a Main class so you can test the module individually
- This module will import/require the Books Module to work.
- This module will export the shared package to be used by other modules.
 
The module-info.java file looks like:
```
module com.jesusgsdev.customersmodule {
    requires java.base;
    requires com.jesusgsdev.booksmodule;

    exports com.jesusgsdev.customersmodule.shared;
}
```

### Reporting Module
- I created a Main class so you can see how we can generate reporting using others modules.
- This module will import/require the Customers and Books Module to work.
 
The module-info.java file looks like:
```
module com.jesusgsdev.reportingmodule {
    requires java.base;

    requires com.jesusgsdev.customersmodule;
    requires com.jesusgsdev.booksmodule;
}
```


### References


- Java 9 Modularity: First Look: https://pluralsight.com/library/courses/java-9-modularity-first-look