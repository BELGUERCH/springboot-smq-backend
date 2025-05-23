# Spring Boot SMQ Backend

Ce projet est une application backend développée en *Spring Boot* dans le cadre d’un stage de fin d’études.  
Elle a pour objectif la *digitalisation de la gestion des non-conformités, des **documents qualité, et du **contrôle de conformité* au sein d’un système de management de la qualité (SMQ).

---

## ✅ Fonctionnalités

### 1. Non-Conformités
•Création, suivi et gestion des non-conformités
•Statut, date de déclaration, description, etc.

### 2. Documents Qualité
•Ajout et suivi des documents (procédures, enregistrements, normes…)

### 3. Contrôle de Conformité
•Planification et suivi des actions de contrôle
•Responsable, date planifiée, état de réalisation

---

## ⚙️ Technologies utilisées

•*Java 17*
•*Spring Boot*
•*Spring Data JPA*
•*Spring Security*
•*PostgreSQL*
•*Swagger (OpenAPI)*
•*Validation avec Jakarta Bean Validation*

---

## 🔐 Sécurité

•Authentification HTTP Basic via Spring Security
•Utilisateur admin par défaut (en mémoire) :
- *Username* : admin
- *Password* : 1234

---

## 📂 Structure du projet
com.qualiteapp.backend
├── config
├── controller
├── model
├── repository
└── resources

---

## 🚀 Comment démarrer

1.Cloner le projet
2.Configurer PostgreSQL dans application.properties
3.Lancer le projet depuis IntelliJ ou avec ./mvnw spring-boot:run
4.Accéder à Swagger UI : http://localhost:8080/swagger-ui/index.html
 
---

 ## Auteur

	*Adam BELGUERCH* – Projet de stage 2025  
	*Contact* : [belguerchadam4@gmail.com]