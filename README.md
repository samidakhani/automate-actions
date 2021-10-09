# automate-actions

1. needs: (Specify the dependancy of a job on another)

2. uses:

- uses: ./.github/actions/my-action (Action from the same repo)
- uses: user/repo@ref (Action from diffrent repo)
- uses: user/repo/path@ref (Action from diffrent repo with path)
- uses: docker://image:tag (Action from a docker image in Docker Hub)
- uses: docker://host/image:tag (Action from a docker image in a docker repo)

3. run:

- run: (Run a sinle command)
- run: | (Run multiple commands)
  Command 1
  Command 2
