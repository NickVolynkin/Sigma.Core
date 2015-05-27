# Sigma 
---
# Functional specification

This document contains functional requirements to the Sigma plugin.

Author: [Nick Volynkin](https://github.com/NickVolynkin)

version: 1.1 of 2015-05-28


### Changelog

<table>
<tr>
    <td width="10%">Version</td>
    <td width="20%">Date</td>
    <td width="70%">Changes</td>
</tr>
<tr>
    <td> 1.1 </td>
    <td> 2015-05-28</td>
    <td> Moved technical parts to the technical specification. Changed plugin name and header.  Added a definitions section, a changelog. Introduced lots of small changes.</td>
</tr>
<tr>
    <td> 1.0 </td>
    <td> 2015-05-26</td>
    <td> Initial version.</td>
</tr>
<tr>
    <td> </td>
    <td> </td>
    <td> </td>
</tr>
</table>

<ol>
## <li> Definitions </li>
Composite launch configurations (CLC) join one or several Eclipse launch configurations (ELC) and can be used to run them simultaneously in one action.

The name is related to the greek letter, used as a sum operator in mathematics. 

- CLC is considered invalid if any of the following is true:
	- it is empty
	- at least one of composing ELCs is unavailable to run
	- it contains a deleted ELC.
- CLC is considered broken if any of the following is true:
	- it can not be deserialized (probably because of corrupt data).

A broken CLC is not supposed to be repaired. It's lost forever. This feature is a second priority.

- CLC is considered unavailable if any of the following is true:
    - it is invalid
    - it is broken
    - it is deleted

User can not run an unavailable CLC and should recieve an error message if they try.

## <li> Distribution </li>

- [ ] User should be able to install plugin in a way, consistent with their usual experience with Eclipse plugins.

## <li> Documentation</li>
### Mandatory features:

- There must be a consistent documentation on GitHub:
    - [ ] Plugin description and use-cases
    - [x] Licensing information
    - [ ] System requirements, including compatible Eclipse versions
    - [ ] An instruction on installing the plugin

### Optional features:

- [ ] Documentation may be available from IDE.


## <li> Features </li>
<ol>
### <li> Mandatory and optional features. </li>

#### CLC management
- Plugin provides an option of managing CLC. It must allow user to
	- [ ] create a CLC
	- [ ] view a list of created CLCs
	- [ ] view composing ELCs of a single currently picked CLC
	- [ ] view other settings of a single currently picked CLC, if they exist.
	- [ ] add and remove ELCs from a single CLC
	- [ ] save a CLC between work sessions
	- [ ] run a CLC the same way as a usual ELC
	- [ ] delete a CLC
- Plugin may allow user to
	- [ ] duplicate existing CLC
	- [ ] copy from (join in terms of sets) an existing CLC
- [ ] Plugin must allow user to add ELCs in Run and Debug modes.
- [ ] Plugin must not allow user to add other CLCs (prevent cycling/nesting).

#### UI features
- Plugin should add an extra configuration type in the following menus:
    - [ ] `Run configurations...`
    - [ ] `Debug configurations...`
- [ ] Plugin may use a custom icon for CLCs.
- [ ] Plugin may add an indication when CLC is changed but not saved (bold font, "*", etc.)
- Saving changes in a CLC must be implemented on the `Apply` button click. This is consistent with usual Eclipse user experience.
- Rejecting changes in a CLC must be implemented on the `Reject` button click.
- [ ] A warning dialog must be shown when user attempts an action, resulting in loss of unsaved changes. (`Reject` / `Back(cancel action)` / `Save`)


#### Invalid CLCs
- A CLC must be recognized as invalid:
	- [ ] when it is empty
	- [ ] when at least one of composing ELCs is unavailable to run
	- [ ] when it contains a deleted ELC.
- Option 1: user is unable to run an invalid CLC.
	- [ ] "Run" button must be disabled.
		- [ ] and enabled when CLC is valid again.
	- [ ] This may be indicated with a changed icon.
		- [ ] Icon should change back when CLC is valid again. 
- Option 2: When user attempts to run an unavailable CLC (deleted or invalid):
	- [ ] Plugin must provide a consistent error message.
	- [ ] Plugin may offer a dialog to pick and run a valid CLC.

- (?) How should plugin react, when a composing ELC was deleted?
    - Silently remove ELC
    - Provide a message
    - Forbid deleting 

#### Broken CLCs
- A CLC must be recognized as broken:
    - [ ] when it can not be deserialized.
- Plugin should properly handle a broken CLC:
    - [ ] Plugin should disallow running a broken CLC and remove it from the list.
    - [ ] Plugin should provide an error message.
 
### <li> Unrequired features </li>
- Plugin is not expected to override or add to settings of composing ELCs.

