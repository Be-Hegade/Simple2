//def call(String name, int age){ this can be done better in another way
def call(Map config = [:]){
     echo "Name is $(config.name) and age is $(config.age)"
}
