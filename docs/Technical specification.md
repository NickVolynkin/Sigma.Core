# Sigma
---
# Technical specification

This document contains technical requirements to the Sigma plugin.

Author: [Nick Volynkin](https://github.com/NickVolynkin)

version: 1.0 of 2015-05-28


## Changelog


<table>
<tr>
    <td width="10%">Version</td>
    <td width="20%">Date</td>
    <td width="70%">Changes</td>
</tr>
<tr>
    <td> 1.0 </td>
    <td> 2015-05-28</td>
    <td> Initial version. Parts of text imported from functional specification</td>
</tr>
<tr>
    <td> </td>
    <td> </td>
    <td> </td>
</tr>
</table>


<ol>
## <li> Distribution </li>

- [ ] Plugin should be provided via a custom Eclipse plugin repository. [See example](https://github.com/sergeche/eclipse-zencoding/blob/master/README.textile#installation).

## <li> Documentation</li>
 - [ ] If exists, should be a part of core plugin.

## <li> Metadata </li>

- [ ] Bundle data should be valid and complete.
- [ ] Plugin must not be dependent on a minor (snapshot) version of Eclipse.

## <li>Architecture and quality</li>
**Sigma.Core** plugin introduces a CLC type and provides management of CLC entities. It is independent and may sometimes be used as a standalone.

**Sigma.UI** plugin introduces UI features for operating **Sigma.Core**.

- [ ] Code for logic and UI should be separated.
    - [ ] Core (logic) plugin should be available to launch from code and without using UI (e.g. for testing, see [this article](http://www.eclipse.org/articles/Article-Launch-Framework/launch.html))

- [ ] Project may be built with Maven.
- [ ] Project may have unit-tests for major features.

- [ ] Configurations are likely to be extended with options in further versions. They must have a custom serialization mechanism, stable at version change. (See Joshua Bloch, Effective Java).

	
## <li>Code style </li>
- Code must follow the [Eclipse Coding Conventions](http://wiki.eclipse.org/Coding_Conventions).
- Code must be formatted with default Eclipse settings.
- If built with Maven, code should successfully pass checks of the following Maven plugins (default formatting style is of higher priority):
	- [ ] org.apache.maven.plugins.maven-checkstyle-plugin
	- [ ] org.codehaus.mojo.findbugs-maven-plugin
	- [ ] org.apache.maven.plugins.maven-pmd-plugin

