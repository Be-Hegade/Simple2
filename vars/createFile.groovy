def call(Map config = [:]){
   //  echo "Name is ${config.name} and age is ${config.age}"
   sh'''
               pwd
               mkdir \${config.fileName}
               '''
}
