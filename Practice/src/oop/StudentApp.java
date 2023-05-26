package oop;

/*
Bài 1: Trong năm 2021 có N sinh viên khoa CNTT đăng ký học phần cấu trúc dữ liệu. Thông
tin mỗi sinh viên được lưu trữ tại hệ thống gồm: Mã sinh viên, Họ tên, Xếp loại
Xếp loại học lực được lưu trong Enum với các giá trị: A, B, C, D, E, F
- Tìm danh sách sinh viên từng đạt loại A trong năm 2021.
- Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021.

	public static Student[] getStudentsToStudyAgain(Student[] students) {
		boolean[] resignedFlag = new boolean[students.length];
		Student[] result = new Student[students.length];
		int count = 0;

		for (int i = 0; i < students.length; i++) {
			if (!resignedFlag[i]) {
				for (int j = i + 1; j < students.length; j++) {
					if (!resignedFlag[j] && students[i].getStudentId() == students[j].getStudentId()) {
						resignedFlag[i] = true;
						resignedFlag[j] = true;
					}
				}
			}
		}

		for (int k = 0; k < resignedFlag.length; k++) {
			if (resignedFlag[k]) {
				result[count++] = students[k];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
*/