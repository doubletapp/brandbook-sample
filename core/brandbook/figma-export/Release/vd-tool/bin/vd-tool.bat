@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  vd-tool startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and VD_TOOL_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\vd-tool.jar;%APP_HOME%\lib\sdk-common-27.1.0.jar;%APP_HOME%\lib\sdklib-27.1.0.jar;%APP_HOME%\lib\builder-test-api-4.1.0.jar;%APP_HOME%\lib\builder-model-4.1.0.jar;%APP_HOME%\lib\ddmlib-27.1.0.jar;%APP_HOME%\lib\shared-27.1.0.jar;%APP_HOME%\lib\bcpkix-jdk15on-1.56.jar;%APP_HOME%\lib\bcprov-jdk15on-1.56.jar;%APP_HOME%\lib\repository-27.1.0.jar;%APP_HOME%\lib\layoutlib-api-27.1.0.jar;%APP_HOME%\lib\dvlib-27.1.0.jar;%APP_HOME%\lib\common-27.1.0.jar;%APP_HOME%\lib\kotlin-stdlib-jdk8-1.3.72.jar;%APP_HOME%\lib\kotlin-reflect-1.3.72.jar;%APP_HOME%\lib\aapt2-proto-4.1.0-alpha01-6193524.jar;%APP_HOME%\lib\protos-27.1.0.jar;%APP_HOME%\lib\protobuf-java-3.10.0.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\trove4j-20160824.jar;%APP_HOME%\lib\gson-2.8.5.jar;%APP_HOME%\lib\commons-compress-1.12.jar;%APP_HOME%\lib\httpmime-4.5.6.jar;%APP_HOME%\lib\httpclient-4.5.6.jar;%APP_HOME%\lib\httpcore-4.4.10.jar;%APP_HOME%\lib\annotations-27.1.0.jar;%APP_HOME%\lib\kxml2-2.3.0.jar;%APP_HOME%\lib\jimfs-1.1.jar;%APP_HOME%\lib\guava-28.1-jre.jar;%APP_HOME%\lib\kotlin-stdlib-jdk7-1.3.72.jar;%APP_HOME%\lib\kotlin-stdlib-1.3.72.jar;%APP_HOME%\lib\annotations-13.0.jar;%APP_HOME%\lib\javax.activation-1.2.0.jar;%APP_HOME%\lib\jaxb-runtime-2.3.1.jar;%APP_HOME%\lib\failureaccess-1.0.1.jar;%APP_HOME%\lib\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;%APP_HOME%\lib\jsr305-3.0.2.jar;%APP_HOME%\lib\checker-qual-2.8.1.jar;%APP_HOME%\lib\error_prone_annotations-2.3.2.jar;%APP_HOME%\lib\j2objc-annotations-1.3.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.18.jar;%APP_HOME%\lib\kotlin-stdlib-common-1.3.72.jar;%APP_HOME%\lib\jaxb-api-2.3.1.jar;%APP_HOME%\lib\txw2-2.3.1.jar;%APP_HOME%\lib\istack-commons-runtime-3.0.7.jar;%APP_HOME%\lib\stax-ex-1.8.jar;%APP_HOME%\lib\FastInfoset-1.2.15.jar;%APP_HOME%\lib\javax.activation-api-1.2.0.jar;%APP_HOME%\lib\commons-logging-1.2.jar;%APP_HOME%\lib\commons-codec-1.10.jar


@rem Execute vd-tool
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %VD_TOOL_OPTS%  -classpath "%CLASSPATH%" com.android.ide.common.vectordrawable.VdCommandLineTool %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable VD_TOOL_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%VD_TOOL_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
