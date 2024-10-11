# JotageFirstPlugin

**JotageFirstPlugin** é um plugin básico para servidores Minecraft desenvolvido com o objetivo de notificar jogadores quando eles coletam itens do chão. O plugin inclui um sistema de ativação/desativação dessa funcionalidade via comando configurável no arquivo `config.yml`.

## Funcionalidades

- Notificação de item coletado: Quando o jogador coleta um item do chão, uma mensagem personalizada é enviada a ele.
- Mensagens personalizadas: As mensagens enviadas aos jogadores podem ser personalizadas com cores e texto, diretamente no `config.yml`.

## Comandos

- `/firstplugintoggle`.

## Configuração

No arquivo `config.yml`, você pode ajustar:

- **message-enabled**: Mensagem enviada quando a notificação é ativada.
- **message-disabled**: Mensagem enviada quando a notificação é desativada.

Exemplo de configuração:

```yaml
message-enabled: "&aNotificações de itens ativadas!"
message-disabled: "&cNotificações de itens desativadas!"
```
