---
name: web-search-docs
description: >-
  Use esta skill quando o estudante tiver dúvidas sobre versões de linguagens,
  novidades de mercado, sintaxes atualizadas, métodos deprecados ou precisar
  validar informações contra documentações técnicas oficiais. Acionada por
  perguntas sobre "versão atual", "está deprecado?", "mudou na versão X?",
  "documentação de...", "é melhor usar X ou Y?".
---

# Consulta e Validação de Documentação

## Procedimento

1. **Identificar a tecnologia e versão**: Confirmar qual ferramenta/biblioteca
   e qual versão o estudante está usando (ex: Java 17, Spring Boot 3.2, Gson 2.10).

2. **Priorizar documentação oficial**: Sempre consultar primeiro as fontes
   oficiais antes de qualquer outra referência:
   - Java: [dev.java](https://dev.java/), [docs.oracle.com](https://docs.oracle.com/en/java/)
   - Spring: [spring.io/docs](https://spring.io/docs)
   - Maven: [maven.apache.org](https://maven.apache.org/)
   - Gradle: [docs.gradle.org](https://docs.gradle.org/)
   - JUnit: [junit.org](https://junit.org/junit5/docs/current/user-guide/)

3. **Validar antes de responder**: Não inventar parâmetros, métodos
   deprecados ou sintaxes que não constem na documentação oficial.

4. **Indicar a fonte**: Sempre incluir o link direto para a seção da
   documentação consultada na resposta.

## Regras
- Se não encontrar informação confiável, informar honestamente ao estudante
  e sugerir onde ele pode procurar.
- Ao comparar tecnologias (ex: "JUnit 4 vs JUnit 5"), apresentar prós e
  contras objetivos com base na documentação, não em opinião.
- Ao mencionar algo deprecado, indicar qual é a alternativa recomendada.
