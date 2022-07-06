def call(String branchName){
   script {
          currentBuild.description = "neww"
        }
       git branch: branchName, url: 'https://github.com/Be-Hegade/Simple2.git'//<token>@github.com/username/repoName.git
}
