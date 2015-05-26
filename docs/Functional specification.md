# Composite Eclipse Launch Configurations plugin
## Functional specification

This document contains functional requirements to the CELC plugin.

Author: [Nick Volynkin](https://github.com/NickVolynkin)

version: 1.0 of 2015-05-27

<ol>
## <li> Distribution </li>

- [ ] There should be a way to install plugin, consistent with usual experience of an Eclipse user.

## <li> Documentation</li>
Documentaton must include the following information:

- [ ] System requirements, including compatible Eclipse versions
- [ ] An instruction on installing the plugin

The following features are optional:

- [ ] Documentation available from IDE.

## <li> Metadata </li>

- [ ] Bundle data should be valid and complete.
- [ ] Plugin must not be dependent on a minor (snapshot) version of Eclipse.

## <li>Code requirements </li>


- [ ] Code for logic and UI should be separated.
- [ ] Code must be formatted with default Eclipse settings.
- [ ] Project may be built with Maven.
- [ ] Project may have unit-tests for major features.
- If built with Maven, code should successfully pass checks of the following Maven plugins:
	- [ ] <todo>


## <li> Features </li>
Composite launch configurations (CLC) join one or several Eclipse launch configurations (ELC) and can be used to run them simultaneously in one action.

### Mandatory and optional features.

- Plugin provides an option of managing CLC. It must allow user to
	- [ ] create a CLC
	- [ ] view a list of created CLCs
	- [ ] view settings of a single currently picked CLC
	- [ ] add and remove ELCs from a single CLC
	- [ ] save a CLC between work sessions
	- [ ] run a CLC the same way as a usual ELC
	- [ ] delete a CLC
- Plugin may allow user to
	- [ ] duplicate existing CLC
	- [ ] copy from (join) existing CLC
- [ ] Plugin must allow user to add both Run and Debug ELCs
- [ ] Plugin must not allow user to add other CLCs (prevent cycling/nesting).
- A CLC is considered invalid:
	- [ ] if it is empty
	- [ ] if at least one of composing ELCs is unavailable to run
	- [ ] if it contains a deleted ELC.
- Option 1: invalid CLC must be unavailable to run.
	- [ ] "Run" button must be disabled.
		- [ ] and enabled when CLC is valid again.
	- [ ] This may be indicated with a changed icon.
		- [ ] Icon should change back when CLC is valid again. 
- Option 2: When user attempts to run an unavailable CLC (deleted or invalid):
	- [ ] Plugin must provide a consistent error message.
	- [ ] Plugin may offer a dialog to pick and run a valid CLC.
- Saving changes in a CLC should be implementing in one of the following ways:
	- [ ] Saving on each change.
	- [ ] Saving on a save button click.
		- [ ] A warning dialog should be shown when user attempts to lose unsaved changes. (Back/Save/Reject)

### Unnecessary features
- Plugin is not expected to override or add to settings of composing ELCs.

<ol>

