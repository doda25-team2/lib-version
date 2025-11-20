# lib-version

This is a library that exposes a `VersionUtil` class that has a `getVersion()` method. This method returns the current version of the library as a string.

## Creating new releases

To create a new release, create a new release on GitHub using https://github.com/doda25-team2/lib-version/releases/new. Enter the desired version in the tag, for example `v1.0.4`. The [release.yml](./.github/workflows/release.yml) workflow will commit the version specified into the pom.xml and push to the selected branch. `lib-version` is built and automatically pushed to the [Maven Package Registry](https://github.com/doda25-team2/lib-version/packages/2744117).
