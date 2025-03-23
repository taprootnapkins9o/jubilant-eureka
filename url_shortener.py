import requests

API_URL = "https://api.shrtco.de/v2/shorten?url="
url = input("🔗 Enter URL to shorten: ")

response = requests.get(API_URL + url).json()
print("✅ Shortened URL:", response['result']['short_link'])
