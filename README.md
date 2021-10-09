# automate-actions

1. needs: (Specify the dependancy of a job on another)

2. uses: (Used to specify an action)

- uses: ./.github/actions/my-action (Action from the same repo)
- uses: user/repo@ref (Action from diffrent repo)
- uses: user/repo/path@ref (Action from diffrent repo with path)
- uses: docker://image:tag (Action from a docker image in Docker Hub)
- uses: docker://host/image:tag (Action from a docker image in a docker repo)

3. run: (Used to run a command)

- run: (Run a single command)
- run: | (Run multiple commands) <br/>
  Command 1 <br/>
  Command 2

4. with: (Used to pass arguments to an action)

5. Environment variables <br />
   a. Default environment variables - GITHUB_WORKFLOW, GITHUB_ACTION, etc <br />
   b. Define environment variables - Use 'env' atribute @ workflow, job, step. <br />
   c. Acessing variables <br />
   A. Shell variable syntax <br/> - bash - $VARIABLE_NAME <br /> - powershell - $Env:VARIABLE_NAME <br />
   B. YAML variable syntax <br />
   ${{env.VARIABLE_NAME}}
