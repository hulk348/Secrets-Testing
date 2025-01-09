###Falso Positivo AWS
# Guía de Configuración del Cluster EKS

Este archivo contiene los pasos necesarios para configurar un cluster de Amazon EKS.

## Pasos de Configuración

1. **Crear un Role de IAM para EKS**
   ```bash
   aws iam create-role --role-name EKSClusterRole --assume-role-policy-document file://eks-role-trust-policy.json

#### **Lo que Harías al Ejecutar `aws configure`:**
Cuando ejecutas el comando `aws configure`, se te pedirá lo siguiente:
```bash
AWS Access Key ID [None]: AKIAEXAMPLE123456780
AWS Secret Access Key [None]: OSECRETEXAMPLEKEY!123WEDFGBNJHYOIU1235!7
Default region name [None]: us-west-2
Default output format [None]: json


















