![example branch parameter](<https://github.com/samidakhani/automate-actions/actions/workflows/05-course3(mergepullrequest).yml/badge.svg>)
![example branch parameter](<https://github.com/samidakhani/automate-actions/actions/workflows/06-course3(linting).yml/badge.svg>)

# automate-actions

1. Job Dependancy

   - needs: (Specify the dependancy of a job on another)

2. Action

   - uses: (Used to specify an action)
   - uses: ./.github/actions/my-action (Action from the same repo)
   - uses: user/repo@ref (Action from diffrent repo)
   - uses: user/repo/path@ref (Action from diffrent repo with path)
   - uses: docker://image:tag (Action from a docker image in Docker Hub)
   - uses: docker://host/image:tag (Action from a docker image in a docker repo)

3. Command Execution

   - run: (Used to run a command)
   - run: (Run a single command)
   - run: | (Run multiple commands) <br/>
     Command 1 <br/>
     Command 2

4. Arguments

   - with: (Used to pass arguments to an action)

5. Environment variables <br />

   - Default environment variables - GITHUB_WORKFLOW, GITHUB_ACTION, etc
   - Define environment variables - Use 'env' atribute @ workflow, job, step.
   - Acessing variables
     - Shell variable syntax <br/> - bash - $VARIABLE_NAME <br /> - powershell - $Env:VARIABLE_NAME <br />
     - YAML variable syntax <br />
       ${{env.VARIABLE_NAME}}

6. Secrets

   - They are defined in the repo settings
   - Accessed via ${{secrets.SECRET_NAME}}

7. Artifacts

   - actions/upload-artifact (Upload an artifact via workflow)
   - actions/download-artifact (Download an artifact via workflow)
   - Manual download from the Github UI<br /><br />
     NOTE:Each job runs within its own virtual environment.
