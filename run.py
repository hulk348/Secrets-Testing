sudo trufflehog git https://github.com/hulk348/Clasificacion_Secretos/ > /mnt/c/Users/ieeo/Documents/reportes/report_trufflehog.json
sudo gitleaks detect --source=./ -r /mnt/c/Users/ieeo/Documents/reportes/report_gitleaks.json
ggshield secret scan repo ./ > /mnt/c/Users/ieeo/Documents/reportes/report_ggshield.txt
