# Linux Basics:
For this course, the operating system I'll be using will be the CentOS.

## Shell Types:
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
This can be done in one of the two ways:
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
