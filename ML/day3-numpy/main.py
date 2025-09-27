import numpy as np

array = np.array([[[1,2,3],[4,5,6],[7,8,9]],
                  [[10,11,12],[13,14,15],[16,17,1.8]]])
print(array.shape, array.ndim, array.dtype)

number = np.array([[1,2,3],
                   [4,5,6,],
                   [7,8,9]])

# array[start:stop:step]

# print(number[0:2:2])
print(number[:, 1:3])



