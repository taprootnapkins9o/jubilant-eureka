from faker import Faker

fake = Faker()
print("💳 Fake Credit Card:", fake.credit_card_number(card_type="visa"))
print("📅 Expiry:", fake.credit_card_expire())
print("🔑 CVV:", fake.credit_card_security_code())
