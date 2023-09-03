#!/bin/bash

# Betiğin bulunduğu dizine git
cd "$(dirname "$0")"

# Kendisini çalıştırılabilir yap
#chmod +x "$0"
if [[ ! -x "$0" ]]; then
  chmod +x "$0"
fi

docker-compose -f docker-compose-dev.yml build
docker-compose -f docker-compose-dev.yml up -d

# Terminali kapat
exit