# Linux Basics:
For this course, the operating system I'll be using will be the CentOS.  
The topics covered in this module are:
1. [Working through the CLI](#working_through_the_cli)
2. [Vi Editor](#vi_editor)
3. [Some more Linux Commands](#some_more_linux_commands)
4. [Package Managers](#package_managers)
5. [Services](#services)

## 1. Working through the CLI:
<a name=working_through_the_cli></a>
### Shell Types:
The text based command line interface that lets you run commands is called Shell.And there are different kind of shells, and each of them behave differently. Some of them are: Bourne Shell(Sh Shell), C Shell(csh or tcsh) Z Shell(zsh) and Bourne Again Shell(bash).
You can see the shell you're using in your environment using the command
```bash
echo $SHELL
```
The echo command helps you print something on the screen, and the '$' sign specifies the environment variable.

### Some commands to run on the command line shell:
1. **echo:**
* `echo` command helps you print something on the screen.
* The `echo` command is usually used to print out environment variables.
* It is also used in scripts when you want to print something out on the screen.
```bash
echo Hi
```
```output
Hi
```

2. **ls:**
* `ls` command is used to list out the contents of a directory/folder.
```bash
ls
```
```output
File.txt my_dir1 file2.conf
```

3. **cd:**
* `cd` command is used to change directories.
* It is used to navigate to different directories in the system.
```bash
cd my_dir1
```

4. **pwd:**
* This stands for 'Present Working Directory'.
* This displays the directory you're currently in right now, in the full path format.
```bash
pwd
```
```output
/home/my_dir1
```

5. **mkdir:**
* This stands for 'Make Directory'.
* This will create an empty directory/folder for us in the location you've given.
```bash
mkdir new_directory
```

**NOTE:** In order run multiple commands in a single line, differentiate them each with a semi-colon.
```bash
cd new_directory; pwd
```
```output
/home/my_dir1/new_directory
```

6. Making directory tree:
* This can be done in one of the two ways:
```bash
mkdir /tmp/asia
mkdir /tmp/asia/india
mkdir /tmp/asia/india/bangalore
```
OR
```bash
mkdir -p /tmp/asia/india/bangalore
```

7. **rm:**
* This means removing files/directories.
* To remove a directory and all it's contents:
```bash
rm -r /tmp/my_dir1
```
* To remove a file, just give the name of the file after the 'rm' command.
```bash
rm file_name1
```

8. **cp:**
* This stands for Copy.
* You can copy files from one location to other location, or you can copy directories as well.
```bash
cp file1 /tmp/file1  # This will copy the file1 from the current location to the '/tmp' directory
cp -r my_dir1 /tmp/my_dir1  # This will copy the directory along with it's contents from the current directory to the '/tmp' directory
```
9. **mv:**
* This stands for move.
* This command is used to move file/directory from one location to another location.
```bash
mv file1 /tmp/file1
```
* This command is also used to rename a file.
```bash
mv file1 file2  # This is moving the file to the same path but with a different name.
```

10. **touch:**
* The touch command will create an empty file for us.
```bash
touch file_name1
```

11. **cat:**
* The cat command is used to either view/glance at the contents of the file or to add contents to the file.
```bash
cat > file_name1  # Add contents to the file
cat file_name1    # View the contents of the file
```
This will give us a prompt to enter some code. And when we're done, we press the `Ctrl + D` to exit out of the input prompt.

## 2. VI Editor:
<a name='vi_editor'></a>
* VI Editor comes pre-installed with most linux operating systems.
* To open a file in vi editor, just type the command `vi file_name` in the shell, and your file will open in the vi editor.
* The VI Editor has two modes of operation: Command mode and Insert mode.
* When you open the file, you're by default in the command mode. In this mode, you can issue commands to the editor to perform actions with the text like copy and delete lines, words, find, and all other things that we do with text editors.
* But you won't be able to write contents to the file in this mode. You have to switch to the insert mode. To do that, just press the command `i` and the vi editor will now switch to the insert mode. To get out of insert mode, press `ESC`.
* Inorder to give commands to the editor, press `:` when in command mode.

### Operations available in the command mode:
1. **move around:**
* You can move aound the file using the arrow keys or the keys: khjl.  
  k -> top  
  h -> left  
  j -> down  
  l -> right  

2. **delete:**
* To delete a character type `x`.
* To delete the entire line, type `dd`.

3. **copy & paste:**
* To copy a line, type `yy`.
* To paste the line, type `p`.

4. **scroll up and down:**
* Scroll up: `Ctrl + u`.
* Scroll down: `Ctrl + d`.

5. **save:**
* To save the file, i.e., write the file to the disk, type `:w`.
* If you have not given a filename when opening the editor, type `:w filename`.

6. **quit(discard):**
* Type: `:q`.

7. **save changes and quit:**
* Type `:wq`.

8. **find command:**
* To find a word, type `/` before that word. For ex: `/of`.
* This highlights all the locations of the word, and the cursor will be pointed at the first occurance of the word.
* To move your cursor to the next occurance, press `n`.

## 3. Some more Linux commands:
<a name='some_more_linux_commands'></a>
Some of the additional commands that will server as the building blocks of linux knowledge.

### Commands associated with User Accounts:
* **whoami:** Gives which user you are.
* **id:** This gives more information about the user you are, like the userid of the user and the groups of which the user is part of.
* **su:** Switch from one user to another user. Syntax: `su user_name`. This will need the user's password you're switching to.
* **ssh::** If you're logging into another system using ssh with username other than yours, you need to give the username like this: `ssh username@192.168.1.2`.
* **sudo:** This is a special keyword that allows normal users to perform actions as root. The sudo permissions are given in the `/etc/sudoers` file. Here the user is a regular user with root privilages.

### Commands associated with Downloading files:
* **curl:** This command will download files. Syntax: `curl http://www.some-site.com/some-file.txt -o`. `-o` is needed at the end, to save the result to a file, or else this command will display the contents of the file on screen.
* **wget:** This command is similar to the curl command. Syntax: `wget http://www.some-site.com/some-file.txt -o some-file.txt`. This also needs the name of the file to save the file.

### Chech OS Version:
```bash
cat /etc/*release*
```
```output
CentOS Linux release 8.3.2011
Derived from Red Hat Enterprise Linux 8.3
NAME="CentOS Linux"
VERSION="8"
ID="centos"
ID_LIKE="rhel fedora"
VERSION_ID="8"
PLATFORM_ID="platform:el8"
PRETTY_NAME="CentOS Linux 8"
ANSI_COLOR="0;31"
CPE_NAME="cpe:/o:centos:centos:8"
HOME_URL="https://centos.org/"
BUG_REPORT_URL="https://bugs.centos.org/"
CENTOS_MANTISBT_PROJECT="CentOS-8"
CENTOS_MANTISBT_PROJECT_VERSION="8"
CentOS Linux release 8.3.2011
CentOS Linux release 8.3.2011
cpe:/o:centos:centos:8
```

## 4. Package Managers:
<a name='package_managers'></a>
Package Managers are software that help us install various softwares in Linux Operating System.
* CentOS uses a package manager called `rmp` which stands for 'Red Hat Package Manager'.
* A software is bundled using the extension `.rmp`.
* Use the RPM to perform operations on the package using this command:
```bash
rpm -i package.rpm  # Installing a Package
rmp -e package.rpm  # Uninstalling a Package
rmp -q package.rpm  # Querying/Searching for a Package
```
* RPM needs the accurate location to download the package.
* RPM does not care about any dependencies that the package may have, i.e., some supporting packages to run smoothly.

* In order to overcome this dependency issue, we use a different package called `yum` package manager.
* 'yum' is a high-level package manager, that uses rpm underneath.
* Running a simple command like `yum install ansible` installs ansible as well as all the other dependencies that it may to run.
* *yum* searches for software repositories that act like warehouses that contains thousands of packages('.rpm' files) to download and install.
* Now, in order for *yum* to find out the packages on these repositories, we have to notify yum which repositories to look for.
* All the addresses of those repositories are stored in a file in location: '/etc/yum.repos.d'
* Every OS comes with a set of default repositories, but if there is a piece of software or the latest version of those softwares are not available in those repositories, we have to edit this list of repos so that yum can find those packages.
* To see the list of repositories available on that OS, run this command:
```bash
yum repolist
```
```output
repo id                         repo name
appstream                       CentOS Linux 8 - AppStream
baseos                          CentOS Linux 8 - BaseOS
extras                          CentOS Linux 8 - Extras
```
* You can see the files in the directory present for the repos using the commands:
```bash
ls /etc/yum.repos.d/
```
```output
CentOS-Linux-AppStream.repo	     CentOS-Linux-FastTrack.repo
CentOS-Linux-BaseOS.repo	     CentOS-Linux-HighAvailability.repo
CentOS-Linux-ContinuousRelease.repo  CentOS-Linux-Media.repo
CentOS-Linux-Debuginfo.repo	     CentOS-Linux-Plus.repo
CentOS-Linux-Devel.repo		     CentOS-Linux-PowerTools.repo
CentOS-Linux-Extras.repo	     CentOS-Linux-Sources.repo
```
* If you open a file, you can see the contents with something like this:
```bash
cat /etc/yum.repos.d/CentOS-Linux-AppStream.repo
```
```output
# CentOS-Linux-AppStream.repo
#
# The mirrorlist system uses the connecting IP address of the client and the
# update status of each mirror to pick current mirrors that are geographically
# close to the client.  You should use this for CentOS updates unless you are
# manually picking other mirrors.
#
# If the mirrorlist does not work for you, you can try the commented out
# baseurl line instead.
[appstream]
name=CentOS Linux $releasever - AppStream
mirrorlist=http://mirrorlist.centos.org/?release=$releasever&arch=$basearch&repo=AppStream&infra=$infra
#baseurl=http://mirror.centos.org/$contentdir/$releasever/AppStream/$basearch/os/
gpgcheck=1
enabled=1
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-centosofficial
```
* These host the URLs to the repos. And if you go to the URLs, you can find the repos that the 'rpm' will use to download and install on your machine.

* To see a list of installed or available packages, run the command: `yum list package_name`
* Using this you can see the package with the specific version, and whether it's installed or not.

* **YUM Commands:**
  * install: `yum install package_name`
  * uninstall: `yum remove package_name`
  * list all available versions of package: `yum --showduplicates list package_name`
  * install specific version of a package: `yum install package_name-verison`

## 5. Services:
<a name='services'></a>
* When any application is installed on the server, that needs to stay running, they are automatically configured on the system as a service.
* To start that service, you provice the command: `service httpd start`. 'httpd' is a server.
* The newer method to do this is: `systemctl start httpd`.
* `systemctl` is the command that is used to manage services on a systemd managed servers.
* Both the above commands serve the same purpose. The 'service' command uses the 'systemctl' utility underneath.
* To stop a running service, run the command: `systemctl stop httpd`.
* To check the status of the service, run the command: `systemctl status httpd`.
* To configure such that the service starts up when the system boots up: `systemctl enable httpd`.
* To configure such that the service doesn't start up when the system boots up: `systemctl disable httpd`.

### Steps to configure a program as a service:
* We want the python program saved in `/opt/code/my_app.py` to start up whenever the server/machine boots up.
* To run this program, the command used is: `/usr/bin/python3 /opt/code/my_app.py`.

**Goal:**
* When you type the command: `systemctl start my_app`, it'll start our own python application. The same goes for other systemctl commands.
* For this to work, we need to configure our program as a `systemd service`.
* We will do this using a 'systemd unit file', which is located on '/etc/systemd/system'.
* The name of the file should be the name of the service with the extension '.service'.
* The contents of the file should look like:(my_app.service)
```
[Unit]
Description=My Python Web Application # Meta-data for the service.

[Service]
ExecStart=/usr/bin/python3 /opt/code/my_app.py  # Command to start the service.
ExecStartPre=/opt/code/configure.sh             # Command before starting the service.
ExecStartPost=/opt/code/email_status.sh         # Command before after the service.
Restart=always                                  # If the app crashes, just restart the service.

[Install]
WantedBy=multi-user.target                      # Starting the service for all users
```
* After the file is set-up, we need to run the command: `systemctl daemon-reload`.
* Now, we have the app, ready to run. We can now perform operations of this app using systemctl command. The app can be enabled and disabled at will.
