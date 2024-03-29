@echo off
set /p standard=Is it standard(y/n)? 

REM Removed spaces around the equals sign when setting a variable. This prevents unwanted spaces in variable values.
if "%standard%"=="y" (
  REM Removed spaces around the equals sign and quotes are not needed in variable assignment (but are needed in the if statement)
  set repo=https://github.com/Adilson-kina/AdilsonKinaAulaDS
) else (
  set /p repo=What is the repo: 
)
set /p whatAdd=What u wanna add:
set /p commit=What is the commit: 
set /p branch=What is the branch: 

REM Corrected the syntax by adding missing double quotes and adjusting spaces.
echo %repo% | findstr /C:"git@" > nul
if %errorlevel% == 0 (
    REM Correct usage of string replacement syntax in batch file. Also, removed unnecessary double quotes.
    set repo=%repo:git@=https://%
    REM Corrected the replacement to replace the colon after the host with a slash.
    set repo=%repo::=/%
)

REM Ensuring variables are used correctly in the git commands.
REM The "&" operator is used to run commands sequentially.
git init & ^
git add %whatAdd% & ^
git commit -m "%commit%" & ^
git remote add origin %repo% & ^
git push -u origin %branch%
