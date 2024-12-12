# Нагрузочное тестирование StubPay-сервиса

**StubPay** — это проект для проведения нагрузочного тестирования над эмулятором платежного сервиса. Основной целью является определение максимальной производительности системы. Проект включает в себя использование Spring Boot, Prometheus, Grafana, Docker и JMeter.

## Цели проекта

1. Эмуляция платежного сервиса для тестирования нагрузки.

2. Сбор метрик производительности с использованием Prometheus.

3. Мониторинг и визуализация данных через Grafana.

4. Автоматизация CI/CD для проведения тестов и генерации отчетов.

5. Определение максимальной производительности системы.

## Инструменты

1. **Java 21** — Spring Boot 3.

2. **Micrometer Prometheus** — метрики.

3. **Prometheus** — сбор метрик.

4. **Grafana** — дашборды для мониторинга.

5. **Docker + Docker Compose** — для контейнеризации и развертывания.

6. **JMeter** — подача нагрузки.


## ⚙️ **API Эндпоинты**

| **Метод**  | **URL**                     | **Описание**                  |
|------------|----------------------------|---------------------------------|
| **POST**   | `/api/payment`              | Создание платежа               |
| **GET**    | `/api/payment/status/{id}`  | Получение статуса платежа     |
| **POST**   | `/api/refund`               | Запрос на возврат средств      |
| **GET**    | `/api/transaction/history`  | История транзакций             |
| **GET**    | `/api/health`               | Проверка состояния сервиса     |

