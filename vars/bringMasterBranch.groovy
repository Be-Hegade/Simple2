def call(string branchName){
   script {
          currentBuild.description = "neww"
        }
       git branch: 'master', url: 'https://github.com/Be-Hegade/Simple2.git'//<token>@github.com/username/repoName.git
}
