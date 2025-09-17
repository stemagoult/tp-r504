docker run -d \
	-p 5001:5000 \
	--name tp2-app \
	--network net-tp4 \
	--mount type=bind,source=/home/fi25-temag/tp-r504/TP4/app_1.py,dst=/srv/app_1.py \
	im-tp2
