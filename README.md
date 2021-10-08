# automate-actions

- needs: (Specify the dependancy of a job on another)
- uses:
  - uses: ./.github/actions/my-action (Action from the same repo)
  - uses: user/repo@ref (Action from diffrent repo)
  - uses: user/repo/path@ref (Action from diffrent repo with patch)
  - uses: docker://image:tag (Action from a docker image in Docker Hub)
  - uses: docker://host/image:tag (Action from a docker image in a docker repo)
