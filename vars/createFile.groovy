def call(String fileName){
   //  echo "Name is ${config.name} and age is ${config.age}"
   
   sh'''
               pwd
               mkdir ${fileName}
               '''
}
