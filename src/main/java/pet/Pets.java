package pet;

    public abstract class Pets {
        private String name;

    public Pets(String name) {
        this.name = name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
        }

        public abstract String speak();
    //Definition: An abstract class is a class that cannot be instantiated on its own and is intended to be subclassed.
    // An abstract method is a method declared without an implementation (i.e., no body) in the abstract class. Subclasses are required to provide an implementation for this method.

    //From chatgpt as well but can explain as well with current understanding
    }

