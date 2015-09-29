::Realiza un clean y test en el perfil develop

@echo off
set workspace=D:\master\spai\Practicas\spai1
::Pinta por consola
echo ----------------------------------------
echo %workspace%
::Me cambio a mi directorio
D:
cd %workspace%

echo ----------------------------------------
call mvn -ff clean test 
cmd /k