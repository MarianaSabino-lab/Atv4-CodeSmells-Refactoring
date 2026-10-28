# Atv4-CodeSmells-Refactoring
Atividade 4 - PSOFT - 2026.2# Atividade 4 — Code Smells e Refatoração

Repositório desenvolvido para a Atividade 4 da disciplina de Projeto de Software (PSOFT), com foco na identificação, análise e proposta de refatoração de *Code Smells*.

## Objetivo

Analisar problemas de qualidade de código em uma aplicação Java, identificar os *Code Smells* presentes e apresentar propostas de refatoração para melhorar a organização, a legibilidade e a manutenibilidade do software.

## Projeto analisado

A análise foi realizada na classe `Request.java`, pertencente ao projeto Apache Tomcat.

## Code Smells identificados

| Code Smell | Problema identificado | Refatoração proposta |
|---|---|---|
| Duplicated Code | Inicialização duplicada de limites do conector. | Extract Method |
| Divergent Change | Concentração de diferentes responsabilidades na classe `Request`. | Extract Class |
| Refused Bequest | Problema na utilização de `setRequest()` e na relação com a interface `HttpServletRequest`. | Composição / Decorator |

## Estrutura do repositório

```text
.
├── apresentacao/
│   └── Apresentação.pdf
├── code-smells/
│   ├── duplicated-code/
│   │   ├── original/
│   │   └── refactored/
│   ├── divergent-change/
│   │   ├── original/
│   │   └── refactored/
│   └── refused-bequest/
│       ├── original/
│       └── refactored/
└── README.md
```

## Materiais

- [Apresentação da atividade](apresentacao/Apresentação.pdf)

## Integrantes

Mariana Barros de Moraes Sabino - 124211050

## Observação

As pastas `original` e `refactored` serão utilizadas para documentar, respectivamente, os trechos originais analisados e as implementações das refatorações propostas.
