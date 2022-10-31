# Contribution Guidelines
Please ensure your pull request adheres to the following guidelines:

Start the Name with a capital.
Check your spelling and grammar.
Make sure your text editor is set to remove trailing whitespace.

## Guidelines for Making Contributions

### Fork the repository
Fork the repository by clicking the fork button on the top of the page. This will create an instance of that entire repository in your account.

### Clone the repository
Clone it to your machine to work with it locally. To clone, click on the clone button , copy the link and run the following command in terminal.

``` $ git clone [HTTPS ADDRESS] ```

### Create Branches
It’s good practice to create a new branch when working with repositories, whether it’s a small project or contributing to a group's work.
Branch name should be short and it should reflect the work we’re doing

``` $ git checkout -b [BRANCH NAME] ```

### Make changes and commit them
Make essential changes to the project and save it.
Then execute ```git status``` , and you’ll see the changes.

Add those changes to the branch using ```git add . ```
Now commit those changes using the git commit command:

``` $ git commit -m "Initial Commit" ```

###  Push changes to GitHub
In order to push the changes to GitHub, we need to identify the remote’s name using ``` git remote ```
If the remote name is origin push the changes by 

```$ git push origin [Branch Name] ```

### Create Pull Request
Go to your repository on GitHub and you’ll see a button “Compare & pull request” and click it. Provide the necssary changes did and submit pull request

### Sync your forked master branch
Before submitting any pull requests to the original repository you have to sync your repository to the original one.

Thank you for your suggestions!

