# 🗺️ Mapa de Problemas Urbanos de Londrina

Este sistema permite o registro e visualização de problemas urbanos na cidade de Londrina-PR, como buracos, lixo acumulado, falhas na iluminação pública etc. Os usuários podem relatar de forma anônima ou autenticada, adicionar imagens e localização via mapa interativo.

## ⚙️ Tecnologias Utilizadas

- **Backend:** Java + Spring Boot
- **Frontend:** React.js + Leaflet
- **Banco de dados:** PostgreSQL
- **Armazenamento de imagens:** Supabase

## 📌 Funcionalidades

- Cadastro de problemas com localização e imagem
- Relatos podem ser anônimos ou com login
- Comentários e votos em cada problema
- Mapa interativo com os problemas registrados

## 🚧 Status do Projeto

🟡 Em desenvolvimento — backend sendo implementado

## 📁 Estrutura do Projeto

ReportaLondrina/ 
├── backend/ # API Spring Boot 
├── frontend/ # Aplicação React 
└── .gitignore
└── README.md

## 🚀 Etapas

1. ✅ Estrutura inicial criada
2. 🔄 Criar entidade Problema
3. 🔄 Implementar upload de imagem via Supabase
4. 🔄 Criar autenticação (usuário ou anônimo)
5. 🔄 Criar mapa interativo no frontend

## 🔒 Autenticação

- Usuários podem relatar anonimamente ou com login
- Usuários autenticados podem comentar e votar

## 🖼️ Upload de Imagens

As imagens são armazenadas no Supabase e referenciadas por URL no backend.

## ✨ Contribuição

Contribuições são bem-vindas! Abra uma issue ou envie um pull request.
