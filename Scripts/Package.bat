::Realiza un clean y test en el perfil develop y un package en el perfil preproduction
@echo off
set workspace=D:\master\spai\Practicas\spai1
::Pinta por consola
echo ----------------------------------------
echo %workspace%
::Me cambio a mi directorio
D:
cd %workspace%

echo ----------------------------------------
call mvn clean test -Denviroment.type=develop

::Aqui se empaqueta en un jar
call mvn package -Denvironment.type=preproduction
cmd /k
::pause